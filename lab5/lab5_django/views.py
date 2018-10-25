from django.http import HttpResponse
from django.shortcuts import render
import json

file = open("json_data.json", "r", encoding="utf8")
data = json.loads(file.read())
file.close()
count_admin_units = len(data["units"]["administration"])
count_mega_facs = len(data["units"]["education"])
count_facs = 0
for mega_fac in data["units"]["education"]:
    count_facs += len(mega_fac["faculties"])

education_programs = []
cathedrs = []
groups = []
for mega_fac in data["units"]["education"]:
    for fac in mega_fac["faculties"]:
        cathedrs.extend(fac["cathedr"])
        for cathedra in fac["cathedr"]:
            for education_program in cathedra["education_programs"]:
                education_programs.append(education_program)
                for year in education_program["year"]:
                    groups.extend(education_program["year"][year])
count_edu_units = count_facs + len(cathedrs) + count_mega_facs

count_students = 0
for group in groups:
    count_students += len(group)


def index(request):
    return HttpResponse("Hello, world!")


def indexRender(request):
    return render(request, 'index.html', {})


def universityInfo(request):
    return render(request, 'universityInfo.html', {
        "json": data,
        "count_facs": count_facs,
        "count_cathedr": len(cathedrs),
        "count_mega_facs": count_mega_facs,
        "count_admin_units": count_admin_units,
        "count_edu_units": count_edu_units,
        "count_students": count_students
    })


def disciplineInfo(request):
    return render(request, 'disciplineInfo.html', {
        "ed_prog_count": len(education_programs),
        "ed_prog": education_programs
    })


def groupsInfo(request):
    return render(request, 'groupsInfo.html', {
        "groups": groups
    })


def departmentsInfo(request):
    return render(request, 'departmentsInfo.html', {
        "cathedrs": cathedrs
    })


def universityStructure(request):
    return render(request, 'universityStructure.html', {
        "data": data
    })
